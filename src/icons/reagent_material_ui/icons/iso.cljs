(ns reagent-material-ui.icons.iso
  "Imports @material-ui/icons/Iso as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def iso (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M0 0h24v24H0zm0 0h24v24H0z", "fill" "none"}) (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zM5.5 7.5h2v-2H9v2h2V9H9v2H7.5V9h-2V7.5zM19 19H5L19 5v14zm-2-2v-1.5h-5V17h5z"}))
                          "Iso"))