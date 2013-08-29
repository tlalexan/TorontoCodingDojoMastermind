(ns mastermind.core-test
  (:require [clojure.test :refer :all]
            [mastermind.core :refer :all]))

(deftest score-test
  (testing "guess has nothing in common with the code"
    (is (= [0 0] (score [:r :r :r :r] [:y :y :y :y]))))
  (testing "guess 0 position 1 color"
    (is (= [0 1] (score [:y :r :r :r] [:b :y :y :y]))))
  (testing "guess 0 position 2 color"
    (is (= [0 2] (score [:y :y :r :r] [:b :b :y :y]))))
  (testing "guess 1 position "
    (is (= [1 0] (score [:r :y :y :y] [:r :g :g :g]))))
  (testing "guess 1 position exists at another location"
    (is (= [1 0] (score [:r :y :r :y] [:r :g :g :g]))))
  (testing "guess 1 position 1 color"
    (is (= [1 1] (score [:r :b :y :y] [:r :g :b :g])))))
