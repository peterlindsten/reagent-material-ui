(ns reagent-material-ui.icons.settings-overscan-two-tone
  "Imports @material-ui/icons/SettingsOverscanTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def settings-overscan-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M3 19.01h18V4.99H3v14.02zM18 10l2.5 2.01L18 14v-4zm-5.99-4.5L14 8h-4l2.01-2.5zM14 16l-1.99 2.5L10 16h4zm-8-6v4l-2.5-1.99L6 10z", "opacity" ".3"}) (e "path" #js {"d" "M14 16h-4l2.01 2.5zm4-6v4l2.5-1.99zm3-7H3c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h18c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 16.01H3V4.99h18v14.02zM6 10l-2.5 2.01L6 14zm6.01-4.5L10 8h4z"}))
                                                 "SettingsOverscanTwoTone"))
