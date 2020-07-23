(ns reagent-material-ui.icons.view-column-sharp
  "Imports @material-ui/icons/ViewColumnSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def view-column-sharp (create-svg-icon (e "path" #js {"d" "M10 18h5V5h-5v13zm-6 0h5V5H4v13zM16 5v13h5V5h-5z"})
                                        "ViewColumnSharp"))
