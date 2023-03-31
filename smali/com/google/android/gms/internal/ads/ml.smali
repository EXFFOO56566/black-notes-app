.class final Lcom/google/android/gms/internal/ads/ml;
.super Landroid/content/BroadcastReceiver;
.source ""


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/gl;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/gl;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ml;->a:Lcom/google/android/gms/internal/ads/gl;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/gl;Lcom/google/android/gms/internal/ads/il;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/ml;-><init>(Lcom/google/android/gms/internal/ads/gl;)V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string v0, "android.intent.action.USER_PRESENT"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ml;->a:Lcom/google/android/gms/internal/ads/gl;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/gl;->a(Lcom/google/android/gms/internal/ads/gl;Z)Z

    return-void

    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string p2, "android.intent.action.SCREEN_OFF"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ml;->a:Lcom/google/android/gms/internal/ads/gl;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/gl;->a(Lcom/google/android/gms/internal/ads/gl;Z)Z

    :cond_1
    return-void
.end method
