package controllers;

import helpers.LoggerHelper;
import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        LoggerHelper.ratingsLogger.info("Ololo");
        return ok(index.render("Your new application is ready."));
    }

}
