pipeline
{
agent 
{
label "Linux"
}
parameters
{
 choice(name: 'Environment',choices: 'Dev\nUAT\nPRD',description: 'Please select Environment')
 string(name:  'servername',description: 'Please enter ip address of Machine where you want to deploy artifact')
 string(name:  'Jobname',description: 'Please Jobname to get ocation of artifact')
  string(name: 'ContainerId',description: 'Please Enter Container ID:')
}
stages
{
stage("build")
{
 steps{

 sh "mvn deploy"
  sh "scp -v -o StrictHostKeyChecking=no /tmp/workspace/${params.Jobname}/target/biomni-1.0-SNAPSHOT.jar root@${params.servername}:/tmp"
  sh "ssh -tt -v -o StrictHostKeyChecking=no root@${params.servername} 'docker cp /tmp/biomni-1.0-SNAPSHOT.jar ${params.ContainerId}:/usr/local/tomcat/webapps'"
  //def ret = sh(script: 'uname', returnStdout: true)
  //println ret
  //sh "curl -ls ${params.servername}:8888/biomni | head -n 1 | cut -c 10-12" > $a
  //sh "echo $a"
  script
  {
 def output = sh returnStdout: true, script: 'ls -l'
   echo ${output}
 }
 }

}

}
}
