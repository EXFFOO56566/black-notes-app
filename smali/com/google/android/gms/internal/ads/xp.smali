.class final Lcom/google/android/gms/internal/ads/xp;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:Lcom/google/android/gms/internal/ads/tp;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/tp;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/xp;->b:Lcom/google/android/gms/internal/ads/tp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/xp;->b:Lcom/google/android/gms/internal/ads/tp;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "surfaceDestroyed"

    invoke-static {v0, v2, v1}, Lcom/google/android/gms/internal/ads/tp;->a(Lcom/google/android/gms/internal/ads/tp;Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method
