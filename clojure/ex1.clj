(ns lasagna)

(def expected-time 40)

(defn remaining-time [actual]
   (- expected-time actual))

(defn prep-time [num_layers]
   (* 2 num_layers))

(defn total-time [num_layers actual]
   (+ (prep-time num_layers) actual))

(println (prep-time 1))
(println (remaining-time 30))
(println (total-time 1 30))
