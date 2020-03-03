import groovy.transform.Field


@Field var1 = "test"
@Field var2 = var2 + "test"
node("master") {
  stage("test"){
    println(var2)
  }
}
