(ns reagent-material-ui.icons.select-all-sharp
  "Imports @material-ui/icons/SelectAllSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def select-all-sharp (create-svg-icon (e "path" #js {"d" "M3 13h2v-2H3v2zm4 8h2v-2H7v2zM3 9h2V7H3v2zm10-6h-2v2h2V3zM3 17h2v-2H3v2zM9 3H7v2h2V3zM5 3H3v2h2V3zm6 18h2v-2h-2v2zm8-8h2v-2h-2v2zm0-4h2V7h-2v2zm0 8h2v-2h-2v2zm-4 4h2v-2h-2v2zm0-16h2V3h-2v2zm4 0h2V3h-2v2zm0 16h2v-2h-2v2zM3 21h2v-2H3v2zm4-4h10V7H7v10zm2-8h6v6H9V9z"})
                                       "SelectAllSharp"))
