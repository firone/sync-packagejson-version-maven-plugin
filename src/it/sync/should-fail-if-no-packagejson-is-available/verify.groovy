import static org.assertj.core.api.Assertions.assertThat
import java.nio.charset.Charset
import java.nio.file.Files

def buildLog = new File(basedir, "build.log")
def lines = Files.readAllLines(buildLog.toPath(), Charset.defaultCharset())

// FIXME assertThat(lines).containsOnlyOnce("[ERROR] No package.json found in this project!")

// Need to return after all checks, otherwise the test will fail!
return
