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
}
stages
{
stage("build")
{
 steps{
  sh "mvn clean install"
 sh "mvn deploy"
  sh "scp -v -o StrictHostKeyChecking=no /tmp/workspace/${params.Jobname}/target/biomni-1.0-SNAPSHOT.jar root@${params.servername}:/tmp"
}
}

}
}
