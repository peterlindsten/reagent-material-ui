(ns reagent-material-ui.icons.menu-open-rounded
  "Imports @material-ui/icons/MenuOpenRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def menu-open-rounded (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M4 18h11c.55 0 1-.45 1-1s-.45-1-1-1H4c-.55 0-1 .45-1 1s.45 1 1 1zm0-5h8c.55 0 1-.45 1-1s-.45-1-1-1H4c-.55 0-1 .45-1 1s.45 1 1 1zM3 7c0 .55.45 1 1 1h11c.55 0 1-.45 1-1s-.45-1-1-1H4c-.55 0-1 .45-1 1zm17.3 7.88L17.42 12l2.88-2.88c.39-.39.39-1.02 0-1.41a.9959.9959 0 00-1.41 0L15.3 11.3c-.39.39-.39 1.02 0 1.41l3.59 3.59c.39.39 1.02.39 1.41 0 .38-.39.39-1.03 0-1.42z"}) (e "path" #js {"d" "M0 0h24v24H0V0z", "fill" "none"}))
                                        "MenuOpenRounded"))