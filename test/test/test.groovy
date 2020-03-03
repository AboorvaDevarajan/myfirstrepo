import groovy.transform.Field



import jenkins.model.*
jenkins = Jenkins.instance


@Field def var1 = "test"
@Field def var2 = var1 + "test"
node("master") {
  stage("test"){
    println(var2)
  }
}
