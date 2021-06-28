package it.edea.eboarding.mygos.transit.presentation.openFeignClient.Interfaces;


import it.edea.eboarding.mygos.transit.presentation.openFeignClient.ReponseDTO.PropertyDTO;
import it.edea.eboarding.mygos.transit.presentation.openFeignClient.config.FeignClientConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

//@FeignClient(name = "portassets-service")
@FeignClient(name = "${portassets.name}", url = "${portassets.url}",configuration = FeignClientConfiguration.class )
public interface IPortAssets {

    @GetMapping("/getList")
    List<PropertyDTO> getListProperty(@RequestParam Long deviceId);
}
