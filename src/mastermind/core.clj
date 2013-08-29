(ns mastermind.core)

(defn score [code guess]
  (let [black (count (filter #{true} (map = code guess)))
        color (count (filter (set guess) code))]
  [black (- color black) ]))


(defn new-game []
  (partial score (take 4 ( repeatedly (fn [] (rand-nth [:r :o :y :g :b :p]))))))
