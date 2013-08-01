# xrepl

Set of utility functions designed to mix-in in your Clojure REPL sessions.

## Install

xrepl functions are inside the user namespace. Since the REPL starts by default in the user namespace, all you need to do from leiningen project.clj is:

(defproject yourprj "0.0.1"
  

  :profiles  {:dev {:dependencies [[xrepl "0.1.0"]]}}

)

## How to run the tests

`lein midje` will run all tests.
