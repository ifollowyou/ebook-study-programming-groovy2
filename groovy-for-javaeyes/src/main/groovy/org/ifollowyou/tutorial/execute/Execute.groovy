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
//
//println "//" + "START:GROOVY_OUTPUT"
//println "groovy -v".execute().text
//println "//" + "END:GROOVY_OUTPUT"
