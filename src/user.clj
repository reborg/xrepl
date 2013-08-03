(ns user
  (:use [clojure.tools.namespace.repl :only (refresh)]))

(defn m 
  "Retrieves all methods supported by the class of the instance. Filter results
  by method name beginning with prefix."
  ([instance]
   (sort (map #(.getName %) (into [] (.getMethods (.getClass instance))))))
  ([instance prefix]
   (filter #(.startsWith (.toLowerCase %) prefix) (m instance))))
