(ns user
  (:use [clojure.tools.namespace.repl :only (refresh)])
  (:use clojure.tools.trace))

(defn m 
  "Retrieves all methods supported by the class of the instance. Filter results
  by method name beginning with prefix."
  ([instance]
   (sort (map #(.getName %) (into [] (.getMethods (.getClass instance))))))
  ([instance prefix]
   (filter #(.startsWith (.toLowerCase %) prefix) (m instance))))

(defmacro ? 
  ([form] `(? ~form #'prn))
  ([form f]
   `(let [x# ~form]
      (~f '~form '~'is x#)
      x#)))
