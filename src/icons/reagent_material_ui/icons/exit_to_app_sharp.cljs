(ns reagent-material-ui.icons.exit-to-app-sharp
  "Imports @material-ui/icons/ExitToAppSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def exit-to-app-sharp (create-svg-icon (e "path" #js {"d" "M10.09 15.59L11.5 17l5-5-5-5-1.41 1.41L12.67 11H3v2h9.67l-2.58 2.59zM21 3H3v6h2V5h14v14H5v-4H3v6h18V3z"})
                                        "ExitToAppSharp"))
