// https://mvnrepository.com/artifact/com.atlassian.commonmark/commonmark
@Grapes(
    @Grab(group='com.atlassian.commonmark', module='commonmark', version='0.15.2')
)

import frink.parser.Frink

import org.commonmark.node.*
import org.commonmark.parser.Parser
import org.commonmark.renderer.html.HtmlRenderer
import groovy.transform.CompileStatic

@CompileStatic
class frink_notebook {

   public static class FrinkVisitor extends AbstractVisitor {
      public void visit(IndentedCodeBlock indentedCodeBlock) {
         println "=======> FRINK ======>\n${indentedCodeBlock.literal}\n=============================\n"
      }
   }

   private static String fname = 'finance-calca.md'

   public static void main(String[] args) {

      Parser parser = Parser.builder().build()
      Node document = parser.parseReader(new File(fname).newReader())
      FrinkVisitor frink_visitor = new FrinkVisitor()

      document.accept(frink_visitor)

      HtmlRenderer renderer = HtmlRenderer.builder().build()
      String html_out = renderer.render(document)
      println html_out


      Frink frink = new Frink()

      String frink_expr = 'gallon^(1/3) -> inches'

      String results = frink.parseString(frink_expr)

      println results.replaceAll(/],/, '],\n')
   }
}
