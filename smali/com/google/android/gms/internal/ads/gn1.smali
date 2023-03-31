.class final Lcom/google/android/gms/internal/ads/gn1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:Lcom/google/android/gms/internal/ads/tl1;

.field private final synthetic c:Lcom/google/android/gms/internal/ads/fn1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/fn1;Lcom/google/android/gms/internal/ads/tl1;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/gn1;->c:Lcom/google/android/gms/internal/ads/fn1;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/gn1;->b:Lcom/google/android/gms/internal/ads/tl1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gn1;->c:Lcom/google/android/gms/internal/ads/fn1;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/gn1;->b:Lcom/google/android/gms/internal/ads/tl1;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/fn1;->b(Lcom/google/android/gms/internal/ads/fn1;Lcom/google/android/gms/internal/ads/tl1;)V

    return-void
.end method
