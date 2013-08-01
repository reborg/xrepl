# xrepl

Set of utility functions designed to mix-in in your Clojure REPL sessions.

## Install

xrepl functions are inside the user namespace. Since the REPL starts by default in the user namespace, all you need to do from leiningen project.clj is:

    (defproject yourprj "0.0.1"
      :profiles  {:dev {:dependencies [[xrepl "0.1.0"]]}}
    )

## Utils

### m

The "m" function (meaning methods) lists all Java based methods supported by a specific class type. This is an useful reminder when you know what your searching is a function belonging to the Java interop side of Clojure.

    user=> (m "some")
    ("charAt" "codePointAt" "codePointBefore" "codePointCount" "compareTo" "compareTo" "compareToIgnoreCase" "concat" "contains" "contentEquals" "contentEquals" "copyValueOf" "copyValueOf" "endsWith" "equals" "equalsIgnoreCase" "format" "format" "getBytes" "getBytes" "getBytes" "getBytes" "getChars" "getClass" "hashCode" "indexOf" "indexOf" "indexOf" "indexOf" "intern" "isEmpty" "lastIndexOf" "lastIndexOf" "lastIndexOf" "lastIndexOf" "length" "matches" "notify" "notifyAll" "offsetByCodePoints" "regionMatches" "regionMatches" "replace" "replace" "replaceAll" "replaceFirst" "split" "split" "startsWith" "startsWith" "subSequence" "substring" "substring" "toCharArray" "toLowerCase" "toLowerCase" "toString" "toUpperCase" "toUpperCase" "trim" "valueOf" "valueOf" "valueOf" "valueOf" "valueOf" "valueOf" "valueOf" "valueOf" "valueOf" "wait" "wait" "wait")

returns a sorted list of all the methods supported by the type of the instance given as an argument (in this case a Java String) as seen by Java reflection. It optionally takes a prefix:

    user=> (m 1 "p")
    ("parseLong" "parseLong")

will only list what starts with the letter "p".

## How to run the tests

`lein midje` will run all tests.
