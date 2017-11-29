# openshift-java-spring
Hello world of a Java + Spring application


## Development Environment
### xPaaS Configuration (System Admin)
oc login -u system:admin
oc project openshift
oc import-image my-jboss-webserver-3/webserver31-tomcat8-openshift --from=registry.access.redhat.com/jboss-webserver-3/webserver31-tomcat8-openshift --confirm

### Developer Steps
oc login -u developer -p developer



#Reference
https://access.redhat.com/documentation/en-us/red_hat_jboss_middleware_for_openshift/3/paged/red_hat_jboss_web_server_for_openshift/get_started
https://stefanopicozzi.blog/2017/07/03/minishift-with-jboss-eap-tutorial/
