package org.ifollowyou.tutorial.execute

println "//" + "START:SVN_OUTPUT"
println "svn help".execute().text
println "//" + "END:SVN_OUTPUT"

println "//" + "START:PROC_OUTPUT"
println "svn help".execute().getClass().name
println "//" + "END:PROC_OUTPUT"

//println "//" + "START:LS_OUTPUT"
//println "ls -l".execute().text
//println "//" + "END:LS_OUTPUT"

// on Windows，编码问题
println "cmd /C dir".execute().text

println "//" + "START:GROOVY_OUTPUT"
println "cmd /C groovy -v".execute().text
println "//" + "END:GROOVY_OUTPUT"


