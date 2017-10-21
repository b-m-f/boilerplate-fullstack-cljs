(ns boilerplate.list
  (:require [reagent.core :as r]))

(defn lister [items]
  [:ul
   (for [item items]
     ^{:key item} [:li "Item " item])])

(defn create_li[]
  [:div
   "Here is a list:"
   [lister (range 3)]])
