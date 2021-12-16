(defn new-list []
    (list))

(defn add-language [item l]
    (conj l item)
)

(defn first-language [l]
    (first l)
)

(defn remove-language [l]
    (pop l)
)

(defn count-language [l]
    (count l)
)

(defn learning-list []
 (count-language 
            (add-language "Javascript" (add-language "Java" (remove-language (add-language "Lisp" (add-language "Clojure" (new-list))))))
         )
)

(println (learning-list))
