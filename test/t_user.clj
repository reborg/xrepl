(ns t-user
  (:use midje.sweet user))

(facts "inspecting supported methods"
       (fact "expecting to see strings methods from Java"
             (m "") => (contains "startsWith"))
       (fact "list of methods is optionally filtered using a prefix"
             (m "" "toc") => (contains "toCharArray")))
