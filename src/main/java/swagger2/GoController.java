package swagger2;

import com.alibaba.fastjson.JSON;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by win7 on 2017/5/10.
 */
@RestController
@RequestMapping(value = "/go")
@Api(value = "GoController", description = "处理订单业务",position = 5)
public class GoController {

    @GetMapping(value = "term", produces = {"application/json", "application/xml"})
    @ApiOperation(value = "获取订单", notes = "你懂得", httpMethod = "GET")
    public String goTerm(String iterm, String datetime) {

        Map<String, Object> map = new HashMap<>();
        map.put("jack", iterm);
        map.put("nick", datetime);

        return JSON.toJSONString(map);
    }

    @ApiOperation(value = "获取线路",notes = "通过appk,获取",httpMethod = "POST")
    @PostMapping(value = "yes",produces ="application/json" )
    public String getYes(@ApiParam(name = "appk",value = "终端appk", required = true) @RequestParam String appk, @ApiParam(name = "busline",value = "线路",required = true) @RequestParam String busline){
        Map<String, Object> map = new HashMap<>();
        map.put("jack", appk);
        map.put("nick", busline);

        return JSON.toJSONString(map);
    }
}
