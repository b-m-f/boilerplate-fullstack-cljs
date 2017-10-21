(ns boilerplate.core
  (:require 
    [boilerplate.header :as header],
    [boilerplate.main :as main],
    [boilerplate.footer :as footer],
    [boilerplate.list :as li],
    [reagent.core :as r]))



(defn container []
  [:div 
   (concat
     [(header/get-header )
      (main/get-main)
      (footer/get-footer)])])

(defn get-header [children]
  [:div children])

(defn init []
  (r/render-component (container)
                      (.querySelector js/document "#content")))

(init)
