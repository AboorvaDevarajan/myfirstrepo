import groovy.transform.Field
def var1 = "test"
def var2 = var1 + "test"
node("master") {
  stage("test"){
    println(var2)
  }
}
