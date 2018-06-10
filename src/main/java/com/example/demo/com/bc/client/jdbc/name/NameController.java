package com.example.demo.com.bc.client.jdbc.name;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2018/6/10 0010.
 */
@RestController
@RequestMapping(value="/name",produces="application/json")
@Component
public class NameController {

    @Autowired
    private NameService nameService;

    @RequestMapping(value="/queryNames",method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public List<Name> queryNames(){
        return nameService.queryNames();
    }

}
