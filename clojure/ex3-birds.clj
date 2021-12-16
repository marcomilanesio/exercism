(def last-week [0 2 5 3 7 8 4])

(defn today [v]
     (get v 6)
)

(defn inc-bird [v]
      (assoc v 6 (+ 1 (today v)))
)

(defn day-without-birds? [v]
      (boolean (some #(= 0 %) v))  ; cast to false (return nil)
)

(defn n-days-count [v d]
      (reduce + (subvec v 0 d))     
)

(defn busy-days [v]
      (count (filter #(> % 4) v))
)

(defn odd-week? [v]
    (= v [1 0 1 0 1 0 1])
)
(println (busy-days last-week))
