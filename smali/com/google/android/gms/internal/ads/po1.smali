.class final Lcom/google/android/gms/internal/ads/po1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:Ljava/lang/Runnable;

.field private final synthetic c:Lcom/google/android/gms/internal/ads/mo1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/mo1;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/po1;->c:Lcom/google/android/gms/internal/ads/mo1;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/po1;->b:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/po1;->c:Lcom/google/android/gms/internal/ads/mo1;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/mo1;->b:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/po1;->b:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method
