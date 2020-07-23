(ns reagent-material-ui.icons.view-array
  "Imports @material-ui/icons/ViewArray as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def view-array (create-svg-icon (e "path" #js {"d" "M4 18h3V5H4v13zM18 5v13h3V5h-3zM8 18h9V5H8v13z"})
                                 "ViewArray"))
