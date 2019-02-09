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
}
stages
{
stage("build")
{
 sh "mvn clean install"
 sh "scp -v -o StrictHostKeyChecking=no /tmp/workspace/Sample_Slave_job/target/biomni-1.0-SNAPSHOT.jar root@${params.servername}:/tmp"
}

}
}
