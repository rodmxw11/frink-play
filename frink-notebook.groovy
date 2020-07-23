// https://mvnrepository.com/artifact/com.atlassian.commonmark/commonmark
@Grapes(
    @Grab(group='com.atlassian.commonmark', module='commonmark', version='0.15.2')
)

import frink.parser.Frink

import org.commonmark.node.*
import org.commonmark.parser.Parser
import org.commonmark.renderer.html.HtmlRenderer


String fname = 'finance-calca.md'

Parser parser = Parser.builder().build()
Node document = parser.parseReader(new File(fname).newReader())
HtmlRenderer renderer = HtmlRenderer.builder().build()
String html_out = renderer.render(document)
println html_out


Frink frink = new Frink()

def frink_expr = 'gallon^(1/3) -> inches'

def results = frink.parseString(frink_expr)

println results.replaceAll(/],/, '],\n')
