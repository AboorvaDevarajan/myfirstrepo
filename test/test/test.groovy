import groovy.transform.Field


@Field var1 = "test"
node("master") {
  stage("test"){
    println(var1)
  }
}
