(ns reagent-material-ui.icons.input-sharp
  "Imports @material-ui/icons/InputSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def input-sharp (create-svg-icon (e "path" #js {"d" "M21 3.01H3c-1.1 0-2 .9-2 2V9h2V4.99h18v14.03H3V15H1v4.01c0 1.1.9 1.98 2 1.98h18c1.1 0 2-.88 2-1.98v-14c0-1.11-.9-2-2-2zM11 16l4-4-4-4v3H1v2h10v3zM23 3.01H1V9h2V4.99h18v14.03H3V15H1v5.99h22V3.01zM11 16l4-4-4-4v3H1v2h10v3z"})
                                  "InputSharp"))
