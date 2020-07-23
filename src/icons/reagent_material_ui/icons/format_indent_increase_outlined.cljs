(ns reagent-material-ui.icons.format-indent-increase-outlined
  "Imports @material-ui/icons/FormatIndentIncreaseOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def format-indent-increase-outlined (create-svg-icon (e "path" #js {"d" "M3 21h18v-2H3v2zM3 8v8l4-4-4-4zm8 9h10v-2H11v2zM3 3v2h18V3H3zm8 6h10V7H11v2zm0 4h10v-2H11v2z"})
                                                      "FormatIndentIncreaseOutlined"))
