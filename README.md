# xrepl

My set of utility functions designed to mix-in eXpand your Clojure REPL sessions. This is my usual dev/user.clj namespace wrapped as a lib for quick re-use.

## Install

xrepl functions are inside the user namespace. Since the REPL starts by default in the user namespace, all you need to do from leiningen project.clj is:

    (defproject yourprj "0.0.1"
      :profiles  {:dev {:dependencies [[xrepl "0.1.3"]]}}
    )

## What's inside (at the moment)?

### (refresh)

xrepl comes with (tools.namespace|https://github.com/clojure/tools.namespace) refresh feature installed. Just (refresh) from the repl at any time to deep reload your files the tools.namespace way.

### m

The "m" function (meaning methods) lists all Java based methods supported by a specific class type. This is an useful reminder when you know what your searching is a function belonging to the Java interop side of Clojure.

    user=> (m "some")
    ("charAt" "codePointAt" "codePointBefore" "codePointCount" "compareTo" "compareTo" "compareToIgnoreCase" "concat" "contains" "contentEquals" "contentEquals" "copyValueOf" "copyValueOf" "endsWith" "equals" "equalsIgnoreCase" "format" "format" "getBytes" "getBytes" "getBytes" "getBytes" "getChars" "getClass" "hashCode" "indexOf" "indexOf" "indexOf" "indexOf" "intern" "isEmpty" "lastIndexOf" "lastIndexOf" "lastIndexOf" "lastIndexOf" "length" "matches" "notify" "notifyAll" "offsetByCodePoints" "regionMatches" "regionMatches" "replace" "replace" "replaceAll" "replaceFirst" "split" "split" "startsWith" "startsWith" "subSequence" "substring" "substring" "toCharArray" "toLowerCase" "toLowerCase" "toString" "toUpperCase" "toUpperCase" "trim" "valueOf" "valueOf" "valueOf" "valueOf" "valueOf" "valueOf" "valueOf" "valueOf" "valueOf" "wait" "wait" "wait")

returns a sorted list of all the methods supported by the type of the instance given as an argument (in this case a Java String) as seen by Java reflection. It optionally takes a prefix:

    user=> (m 1 "p")
    ("parseLong" "parseLong")

will only list what starts with the letter "p".

### tool.trace

[Tool.trace](https://github.com/clojure/tools.trace) (ex contrib) is now included in your REPL sessions! The way I use it the most is to request tracing for a specific method like so:

      (trace-vars some.namespace/some-method)
      (untrace-vars some.namespace/some-method)

to start tracking parameters and return entering a function and then stopping the trace with untrace.

### debugging macro

Another useful tool, when you want a finer granularity printing debug information, is the ? macro. Just apply the macro to the form you want to print:

      (? (some-fn param1 param2))

it is functionally equivalent to (some-fn param1 param2) with the addition of the side effect of printing the evaluated form to standard output.

## todo

* travis-ci widget on the github page
