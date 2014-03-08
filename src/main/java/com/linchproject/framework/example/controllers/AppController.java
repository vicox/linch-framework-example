package com.linchproject.framework.example.controllers;

import com.linchproject.core.Params;
import com.linchproject.core.Result;
import com.linchproject.framework.Controller;

/**
 * @author Georg Schmidl
 */
public class AppController extends Controller {

    public Result index(Params params) {
        return render("index", context().put("hello", "Hello World"));
    }
}
