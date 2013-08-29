(ns mastermind.core)

(defn score [code guess]
  (let [match-map (map = code guess)
        position-matches (count (filter #{true} match-map))
        non-matching (keep-indexed (fn [index item] (if (not (nth match-map index)) item)) guess)
        color-matches (count (filter (set non-matching) code))]
  [position-matches color-matches]))

(defn new-game []
  (partial score (take 4 ( repeatedly (fn [] (rand-nth [:r :o :y :g :b :p]))))))
