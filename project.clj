(defproject xrepl "0.1.0"
  :description "Set of utility functions designed to mix-in in your Clojure REPL sessions."
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :plugins [[lein-midje "3.0.1"]]
  :profiles {:dev {:dependencies [[midje "1.5.1"]]}})
