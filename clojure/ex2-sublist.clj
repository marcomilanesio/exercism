(def l1 '(1 2 3))
(def l2 '(1 2 3 4 5))

(defn classify [l1 l2]
    (cond (= l1 l2) :equal
		  (= [] l1) :sublist
		  (= [] l2) :superlist
		  (some #(= l1 %) (partition (count l1) 1 l2)) :sublist
		  (some #(= l2 %) (partition (count l2) 1 l1)) :superlist
		  :else :unequal
	)
)

(println (classify l1 l2))
