import groovy.transform.Field



import jenkins.model.*
jenkins = Jenkins.instance


@Field var1 = "test"
@Field var2 = var2 + "test"
node("master") {
  stage("test"){
    println(var2)
  }
}
