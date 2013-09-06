(defproject xrepl "0.1.2"
  :description "Set of utility functions designed to mix-in in your Clojure REPL sessions."
  :url "https://github.com/reborg/xrepl"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/tools.namespace "0.2.4"]
                 [org.clojure/tools.trace "0.7.6"]]
  :plugins [[lein-midje "3.0.1"]]
  :profiles {:dev {:dependencies [[midje "1.5.1"]]}})
