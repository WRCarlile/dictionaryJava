import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {

    staticFileLocation("/public");

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());

    get("/dictionary/new", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/dictionaryForm.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());


    post("/dictionary", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      String word = request.queryParams("word");
      Word newWord = new Word(word);
      model.put("template", "templates/definitionWordSuccess.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());

    get("/dictionary/", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("dictionary", Word.all());
      model.put("template", "templates/dictionaryForm.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());

    get("dictionary/:id/definitions/new", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      Word dictionary = Word.find(Integer.parseInt(request.params(":id")));
      model.put("dictionarys", dictionary);
      model.put("template", "templates/wordDefinitionForm.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());

    post("/definitions", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();

      Word dictionary = Word.find(Integer.parseInt(request.queryParams("dictionaryId")));

      String definition = request.queryParams("definition");
      Define newDefinition = new Define(definition);

      dictionary.addDefine(newDefinition);

      model.put("dictionary", dictionary);
      model.put("template", "templates/category-tasks-success.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());



  }
}
