(ns reagent-material-ui.icons.flip-two-tone
  "Imports @material-ui/icons/FlipTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def flip-two-tone (create-svg-icon (e "path" #js {"d" "M19 7h2v2h-2zm0 14c1.1 0 2-.9 2-2h-2v2zm0-6h2v2h-2zm0-4h2v2h-2zM9 5V3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h4v-2H5V5h4zm10-2v2h2c0-1.1-.9-2-2-2zm-8-2h2v22h-2zm4 2h2v2h-2zm0 16h2v2h-2z"})
                                    "FlipTwoTone"))
