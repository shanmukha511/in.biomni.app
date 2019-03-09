pipelineJob('Pipeline123') {
    definition {
        cpsScm {
            scm {
                git('https://github.com/shanmukha511/in.biomni.app.git')
               
            }
        }
    }
}
