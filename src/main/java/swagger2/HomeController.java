package swagger2;

/**
 * Created by win7 on 2017/5/9.
 */
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/controll/v1/api")
@Api(value="GeneratorAPI",description="GeneratorAPI LIST")
public class HomeController {

    @RequestMapping(value="add",method=RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value="",notes="")
    public String add(){

        return "success";


    }

    @RequestMapping(value="query",method=RequestMethod.POST,produces={"application/json","application/xml"})
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value="",notes="")
    public String query(@ApiParam(name="id",value="查询参数用户ID")String id,@ApiParam(name="name",value="查询参数用户名")String name){

        return "success";


    }
//
//    @RequestMapping(value="update",method=RequestMethod.POST,produces={"application/json","application/xml"})
//    @ResponseStatus(HttpStatus.OK)
//    @ApiOperation(value="",notes="")
//    public String update(@RequestBody TMsmartPayment tmsPayment,HttpServletRequest request,HttpServletResponse response){
//
//        return "success";
//
//
//    }
//
//    @RequestMapping(value="delete",method=RequestMethod.POST,produces={"application/json","application/xml"})
//    @ResponseStatus(HttpStatus.OK)
//    @ApiOperation(value="",notes="")
//    public String delete(@RequestBody TMsmartPayment tmsPayment,HttpServletRequest request,HttpServletResponse response){
//
//        return "success";
//
//
//    }



}